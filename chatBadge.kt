
//    Applies the chat badge number and sets it to visible
    private fun setUpChatBadge(){
    Log.d("RIYAZ_CHAT","Inside: setUpChatBadge()")
        val ourBottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)
        ourBottomNavigationView.getOrCreateBadge(R.id.navigation_chat).apply {
            number = 100
            isVisible = true
        }

    }
