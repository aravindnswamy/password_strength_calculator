package com.aravind.password.strength.calculator.services.impl

import com.aravind.password.strength.calculator.services.IPasswordStrengthCalculatorRestService
import com.aravind.password.strength.calculator.viewobjects.response.PasswordStrengthCalculatorResponse
import com.nulabinc.zxcvbn.Zxcvbn
import org.springframework.stereotype.Service

/**
 * Rest level service for the Member Password Strength Calculation.
 * @author aravind.n
 */

@Service
class PasswordStrengthCaluculatorRestService : IPasswordStrengthCalculatorRestService {

    private val zxcvbn = Zxcvbn()

    @Override
    override fun computeStrength(password : String) : PasswordStrengthCalculatorResponse {
        return PasswordStrengthCalculatorResponse(zxcvbn.measure(password).score)
    }
}