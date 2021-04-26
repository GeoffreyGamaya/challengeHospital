package com.edgelab.hospital.entities

/**
 * State contains the known states of a patient,
 * just add an enum in the list if needed.
 */
enum class State(val statusCode: String) {

  FEVER("F"), HEALTHY("H"), DIABETES("D"), TUBERCULOSIS("T"), DEAD("X");

  companion object {
    fun parseStates(input: String): List<State> {
      return input.split(",").filter { it.isNotEmpty() }.map { values().first { v -> v.statusCode == it } }
    }
  }
}