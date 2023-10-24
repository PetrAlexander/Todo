package com.example.todo.navigation

sealed class Screen(
    val route: String
) {
    object Notes: Screen(ROUTE_NOTES)
    object Details: Screen(ROUTE_DETAILS)
    private companion object {
        private const val ROUTE_NOTES = "notes"
        private const val ROUTE_DETAILS = "details"
    }
}
