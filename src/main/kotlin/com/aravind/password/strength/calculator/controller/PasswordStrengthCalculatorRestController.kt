package com.aravind.password.strength.calculator.controller

import com.aravind.password.strength.calculator.services.impl.PasswordStrengthCaluculatorRestService
import com.aravind.password.strength.calculator.viewobjects.request.PasswordStrengthCalculatorRequest
import com.aravind.password.strength.calculator.viewobjects.response.PasswordStrengthCalculatorResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotNull

/**
 * REST Controller Class for PasswordStrengthCalculator.
 * @author aravind.n
 */

@RestController
@RequestMapping("/v1/password")
class PasswordStrengthCalculatorRestController {

    @Autowired
    private lateinit var passwordStrengthCalculatorService : PasswordStrengthCaluculatorRestService

    @RequestMapping("computeStrength", method = [RequestMethod.POST])
    fun computeStrength(@RequestBody @NotNull passwordStrengthCalculatorRequest: PasswordStrengthCalculatorRequest) :
            PasswordStrengthCalculatorResponse{

        return passwordStrengthCalculatorService.computeStrength(passwordStrengthCalculatorRequest.password)
    }
}
