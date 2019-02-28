package com.example.lrnand_571

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lrnand_571.AnotherActivity.Companion.DATA_STRING_EXTRA
import com.example.lrnand_571.AnotherActivity.Companion.REQUEST_CODE

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, AnotherActivity::class.java)

        intent.putExtra(DATA_STRING_EXTRA, "12345!")

        startActivityForResult(intent, REQUEST_CODE.toInt())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode == REQUEST_CODE.toInt()) {
            if (resultCode == Activity.RESULT_OK) {
                Toast.makeText(this, "Результат получен!: ${data?.getStringExtra(DATA_STRING_EXTRA)}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
