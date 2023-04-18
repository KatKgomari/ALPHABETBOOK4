package com.example.alphabetbook4

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class LetterPages : AppCompatActivity() {
    private lateinit var bitmap: Bitmap
    private var currentPictureID = 0
    private lateinit var position: Array<Int>
    private var place = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter_pages)
        // Array to track which picture is being displayed.
        position = arrayOf<Int>(R.id.A, R.id.B, R.id.C, R.id.D, R.id.E,R.id.F,R.id.G, R.id.H, R.id.I, R.id.J, R.id.K, R.id.L, R.id.M, R.id.N, R.id.O, R.id.P, R.id.Q, R.id.S, R.id.T, R.id.U, R.id.V, R.id.W, R.id.X, R.id.Y, R.id.Z )
        var pictureID = intent.extras!!.get("imageID") as Int
        getAndSetpicture(pictureID)
    }

    private fun getAndSetpicture(picID: Int) {
    var imageView: ImageView = findViewById(R.id.justpicture)

    when (picID) {
        R.id.A -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.a)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.A
        }
        R.id.B -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.b)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.B
        }
        R.id.C-> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.c)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.C
        }
        R.id.D -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.d)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.D
        }
        R.id.E -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.e)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.E
        }
        R.id.F -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.f)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.F
        }
        R.id.G -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.g)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.G
        }
        R.id.H-> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.h)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.H
        }
        R.id.I -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.i)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.I
        }
        R.id.J -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.j)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.J
        }
        R.id.K -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.k)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.K
        }

        R.id.L -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.l)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.L
        }
        R.id.M -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.m)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.M
        }
        R.id.N -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.n)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.N
        }
        R.id.O -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.o)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.O
        }
        R.id.P -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.p)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.P
        }
        R.id.Q -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.q)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.Q

        }
        R.id.R -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.r)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.R
        }
        R.id.S -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.s)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.S
        }
        R.id.T -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.t)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.T
        }
        R.id.U -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.u)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.U
        }
        R.id.V -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.v)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.V
        }
        R.id.W -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.w)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.W
        }
        R.id.X -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.x)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.X
        }
        R.id.Y -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.y)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.Y
        }
        R.id.Z -> {
            bitmap = BitmapFactory.decodeResource(resources, R.drawable.z)
            imageView.setImageBitmap(bitmap)
            currentPictureID = R.id.Z
        }
    }
}

    //overview button
    fun openOverview(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    // first page button
    fun openFirstPage(view: View){
        var imageView: ImageView = findViewById(R.id.justpicture)
        getAndSetpicture(R.id.A)

    }

    // last page button
    fun openLastPage(view: View){
        var imageView: ImageView = findViewById(R.id.justpicture)
        getAndSetpicture(R.id.Z)

    }

    // next page button
    fun openNextPage(view: View){
        var imageView: ImageView = findViewById(R.id.justpicture)

        var currentID = currentPictureID
        var place = position.indexOf(currentID)
        place++
        if( (place >= 0) && (place < 26)) {
            getAndSetpicture(position[place])

        }
        else {

            Toast.makeText(applicationContext, "YOU ARE ON THE LAST PAGE", Toast.LENGTH_LONG).show()
            getAndSetpicture(position[25])
        }
    }

    fun openPreviousPage(view: View){
        var imageView: ImageView = findViewById(R.id.justpicture)

        var currentID = currentPictureID// This still has the very first picture
        var place = position.indexOf(currentID)
        place--
        if( (place >= 0) && (place < 26)) {
            getAndSetpicture(position[place])
        }
        else {
            Toast.makeText(applicationContext, "YOU ARE ON THE FIRST PAGE", Toast.LENGTH_LONG).show()
            getAndSetpicture(position[0])

        }
    }
}