package com.example.lrnand_571

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_another.*
import android.content.Intent



class AnotherActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_another)
        receivedData.text = intent.getStringExtra(DATA_STRING_EXTRA)

        finishWithResultButton.setOnClickListener {
            val data = Intent()
            data.putExtra(DATA_STRING_EXTRA, "Hi, Activity!")
            setResult(Activity.RESULT_OK, data)
            finish()
        }
    }

    companion object {
        const val DATA_STRING_EXTRA = "data_string_extra"
        const val REQUEST_CODE: Short = 1050
    }
}