package id.co.imastudio.firstkotlin

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHitung.setOnClickListener {

            if (input1.text.toString().isNotEmpty() && input2.text.toString().isNotEmpty()) {

                var inputsatu = input1.text.toString()
                var inputdua = input2.text.toString()

                var nilaisatu = inputsatu.toDouble()
                var nilaidua = inputdua.toDouble()

                var luas = nilaisatu * nilaidua

                munculinAlert(luas.toString())

            } else {
                munculinAlert("diisi dulu")

//                Toast.makeText(this, "harus diisi", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private fun munculinAlert(pesan: String) {
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Hasil Kali")
        alert.setMessage(pesan)
        alert.setPositiveButton("OK", DialogInterface.OnClickListener { dialogInterface, i ->
            dialogInterface.dismiss()
        })
        alert.show()
    }
}
