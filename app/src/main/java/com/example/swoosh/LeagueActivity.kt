package com.example.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var selectedLeague = ""

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        fun leagueNextClick(view: View) {
            if(selectedLeague != ""){
                val skillActivity = Intent(this, SkillActivity::class.java)
                skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
                startActivity(skillActivity)
            } else {
                Toast.makeText(this, "Select one option", Toast.LENGTH_SHORT).show()
            }
        }

        fun onMenClick(view: View){
            womenButton.isChecked = false
            coEdButton.isChecked = false
            selectedLeague = "men"
        }

        fun onWomenClick(view: View){
            menButton.isChecked = false
            coEdButton.isChecked = false
            selectedLeague = "women"
        }

        fun onCoClick(view: View){
            menButton.isChecked = false
            womenButton.isChecked = false
            selectedLeague = "co-ed"
        }

    }
}
