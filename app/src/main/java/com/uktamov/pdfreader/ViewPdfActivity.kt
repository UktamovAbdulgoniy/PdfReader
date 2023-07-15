package com.uktamov.pdfreader

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.Keep
import com.github.barteksc.pdfviewer.PDFView

@Keep
class ViewPdfActivity : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pdf)
        supportActionBar?.hide()

        pdfView = findViewById(R.id.pdfView)
        pdfView.fromAsset("book.pdf").load()

//        selectPdfFromStorage()
    }

//    private fun selectPdfFromStorage() {
//        Toast.makeText(this, "Select Pdf File", Toast.LENGTH_SHORT).show()
//        val browseStorage = Intent(Intent.ACTION_GET_CONTENT)
//        browseStorage.type = "application/pdf"
//        browseStorage.addCategory(Intent.CATEGORY_OPENABLE)
//        startActivityForResult(Intent.createChooser(browseStorage,"Select Pdf"),100)
//    }
//
//    fun showPdfFromUri(uri: Uri?){
//        pdfView.fromUri(uri)
//            .defaultPage(0)
//            .spacing(10)
//            .load()
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == 100 && resultCode == Activity.RESULT_OK && data != null){
//            val selectedPdf = data.data
//            showPdfFromUri(selectedPdf)
//        }
//    }
}