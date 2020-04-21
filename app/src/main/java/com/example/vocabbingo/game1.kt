package com.example.vocabbingo

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game1.*

class game1 : AppCompatActivity() {
    lateinit var mp1: MediaPlayer
   /* lateinit var mp2: MediaPlayer
    lateinit var mp3: MediaPlayer
    lateinit var mp4: MediaPlayer
    lateinit var mp5: MediaPlayer
    lateinit var mp6: MediaPlayer*/

    private var correct:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)

        val number1 = findViewById(R.id.ib1) as ImageButton

        number1.setOnClickListener {

        }}
        /*val number2 = findViewById(R.id.imageButton2) as ImageButton

        number2.setOnClickListener {
            Toast.makeText(this@game1, "number 1.", Toast.LENGTH_SHORT).show()
        }
        val number3 = findViewById(R.id.imageButton3) as ImageButton

        number3.setOnClickListener {
            Toast.makeText(this@game1, "number 1.", Toast.LENGTH_SHORT).show()
        }
        val number4 = findViewById(R.id.imageButton4) as ImageButton

        number4.setOnClickListener {
            Toast.makeText(this@game1, "number 2.", Toast.LENGTH_SHORT).show()
        }
        val number5 = findViewById(R.id.imageButton5) as ImageButton

        number5.setOnClickListener {
            Toast.makeText(this@game1, "number 45.", Toast.LENGTH_SHORT).show()
        }
        val number6 = findViewById(R.id.imageButton6) as ImageButton

        number6.setOnClickListener {
            Toast.makeText(this@game1, "number 5.", Toast.LENGTH_SHORT).show()
        }*/


            //("this will jump from 1 to 3")



// a function that takes an integer as a progress

        fun onClick(view: View) {
            //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            when (view.id) {
                R.id.ib1 -> {
                    switchNigga(2)
                    Toast.makeText(this, "button 2 clicked", Toast.LENGTH_SHORT)
                        .show()//single line code
                }
                R.id.imageButton2-> {
                    switchNigga(1)
                    val myToast = Toast.makeText(this, "button 4 clicked", Toast.LENGTH_SHORT)
                    myToast.show()
                }
            }
        }


        var x = 3

        var y = 1

// a function that takes an integer as a progress

        fun switchNigga(progress: Int )

        {

            when (progress) {

                1 -> {
                    while(true){

                        if (x*y >10) {

                            Toast.makeText(this@game1, "number 1.", Toast.LENGTH_LONG).show()

                            break
                        }



                        if (x*y <10){
                            Toast.makeText(this@game1, "number 7.", Toast.LENGTH_LONG).show()
                            println("Looping back inside WHILE")
                            println("Y is now equals to = $y")
                            y++
                            println("Y after incrementing is = $y")
                        }

                    }


                }
                2 -> {
                    Toast.makeText(this@game1, "number 2.", Toast.LENGTH_LONG).show()
                    switchNigga(3)

                }

                3 -> { println("we reached 3 now.. bye bye!")


                }


            }

        }

// calling the function with

    }








      /*  var mp2: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp2?.start()

        mp2?.release()
        mp2 = null

        var mp3: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp3?.start()

        mp3?.release()
        mp3 = null

        var mp4: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp4?.start()

        mp4?.release()
        mp4 = null

        var mp5: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp5?.start()

        mp5?.release()
        mp5 = null

        var mp6: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp6?.start()

        mp6?.release()
        mp6 = null

        var mp7: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp7?.start()

        mp7?.release()
        mp7 = null

        var mp8: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp8?.start()

        mp8?.release()
        mp8 = null

        var mp9: MediaPlayer? = MediaPlayer.create(context, R.raw.sound_file_1)
        mp9?.start()

        mp9?.release()
        mp9 = null
*/




