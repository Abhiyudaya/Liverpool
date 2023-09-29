package com.example.listview_customized

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Type circular image view hdon in web
        //Find hdodenhof/CircleImageView github repo
        //Find dependencies from gradle and paste in Gradle script -> dependencies
        //Copy the usage and paste in eachitem.xml



        //Create a Kotlin class (Data class) in com.example.listview_customized named User

        val name= arrayOf("Alisson Becker","Andy Robertson","Trent Alexander Arnold","Roberto Firmino","Dominik Szoboszlai","Ryan Gravenberch")
        val lastMsg= arrayOf("Hey Wassup","I am fine","Good","Awesome","Cool","Better")
        val lastMessageTime= arrayOf("06:25 AM","07:05 AM","10:45 AM","06:43 PM","09:56 PM","11:32 PM")
        val phoneNumber= arrayOf("9937122323","1223434554","1234567890","1223344556","4567788912","3445672312")
        val imgId= intArrayOf(R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6)

        userArrayList = ArrayList()

        for(eachIndex in name.indices){
            val user=User(name[eachIndex],lastMsg[eachIndex],lastMessageTime[eachIndex],phoneNumber[eachIndex],imgId[eachIndex])

            userArrayList.add(user)
        }

        val listView=findViewById<ListView>(R.id.listView)
        listView.isClickable= true
        listView.adapter=MyAdapter(this,userArrayList)
    }
}