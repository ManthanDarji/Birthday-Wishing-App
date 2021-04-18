package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    //when the button clicked by the user this function will run.
    fun createBirthdayCard(view: View){

        //get the name from the input by the use of id.
        val name = nameInput.editableText.toString()

        //sending  the name from main activity to another activity
        val intent = Intent(this,BirthdayGreetingActivity::class.java)

        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA , name)

        startActivity(intent)

    }

}
