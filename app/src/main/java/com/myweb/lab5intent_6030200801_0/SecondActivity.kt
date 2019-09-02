package com.myweb.lab5intent_6030200801_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newStudent = data?.getParcelable<Student>("stdData")
        idText.text = "Student ID : ${newStudent?.id}"
        nameText.text = "Student name : ${newStudent?.name}"
        ageText.text = "Student Age : ${newStudent?.age}"

    }

    fun onClickClose(view: View) {
        finish()
    }
}
