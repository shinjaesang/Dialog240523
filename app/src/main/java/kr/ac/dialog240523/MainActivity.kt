package kr.ac.dialog240523

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {
            //체크박스 목록 대화상자
            var placeArr = arrayOf("집1", "집2", "집3")
            var selectArr = booleanArrayOf(true, false, false)
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 핫플")
            dialog.setIcon(R.drawable.icon1)
            dialog.setMultiChoiceItems(placeArr, selectArr){d1, which, isChecked->
                btnDialog.text = placeArr[which]
            }

            dialog.setPositiveButton("닫기", null)
            dialog.show()

        }
    }
}