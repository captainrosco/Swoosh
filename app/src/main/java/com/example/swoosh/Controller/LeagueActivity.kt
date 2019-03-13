package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R.layout.activity_league
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    var player = Player("", "")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_league)
    }

    fun onNextClick(view: View){
        if(player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Select one option", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClick(@Suppress("UNUSED_PARAMETER") view: View){
        womenButton.isChecked = false
        coEdButton.isChecked = false
        player.league = "men"
    }

    fun onWomenClick(view: View){
        menButton.isChecked = false
        coEdButton.isChecked = false
        player.league = "women"
    }

    fun onCoClick(view: View){
        menButton.isChecked = false
        womenButton.isChecked = false
        player.league = "co-ed"
    }

}
