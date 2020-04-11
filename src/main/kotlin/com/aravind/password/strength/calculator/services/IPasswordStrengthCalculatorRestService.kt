package com.aravind.password.strength.calculator.services

import com.aravind.password.strength.calculator.viewobjects.response.PasswordStrengthCalculatorResponse

/**
 * Rest level interface for PasswordStrengthCalculator.
 * @author aravind.n
 */

interface IPasswordStrengthCalculatorRestService {

    fun computeStrength(password : String) : PasswordStrengthCalculatorResponse
}
