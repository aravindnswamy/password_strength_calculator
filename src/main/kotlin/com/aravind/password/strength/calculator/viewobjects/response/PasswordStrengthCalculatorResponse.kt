package com.aravind.password.strength.calculator.viewobjects.response

import javax.validation.constraints.NotNull

/**
 * Response Object for PasswordStrength
 * @author aravind.n
 */

data class PasswordStrengthCalculatorResponse(@NotNull val passwordScore : Int)