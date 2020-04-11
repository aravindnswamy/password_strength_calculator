package com.aravind.password.strength.calculator.viewobjects.request

import javax.validation.constraints.NotNull

/**
 * Request Object for PasswordStrengthCalculator
 * @author aravind.n
 */

data class PasswordStrengthCalculatorRequest(@NotNull val password : String)