package com.example.smack

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smack.databinding.ActivityCreateUserBinding
import java.util.Random
import com.example.smack.databinding.ActivityMainBinding
class CreateUserActivity : AppCompatActivity() {
     lateinit var  binding: ActivityCreateUserBinding
     var userAvatar= "profileDefault"
    var avatarColor="[0.5, 0.5, 0.5, 1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
        binding = ActivityCreateUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun genereteUserAvatar(view: View){
        val random= Random()
        val color = random.nextInt(2)
val avatar= random.nextInt(28)
        println(avatar)
        println(color)
        if (color==0){
            userAvatar="light$avatar"
        }
        else{
            userAvatar="dark$avatar"
        }
        val resourseID= resources.getIdentifier(userAvatar,"drawable",packageName)
binding.createAvatarImageView.setImageResource(resourseID)

    }
    fun createUserClicked(view:View){

    }
    fun generateColorClicked(view: View){
        val random= Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)
        println( " $r $g $b")
        binding.createAvatarImageView.setBackgroundColor(Color.rgb(r,g,b))
        val saveR=r.toDouble()/255
        val saveG=g.toDouble()/255
        val saveB=b.toDouble()/255
        avatarColor="[$saveR,$saveG,$saveB,1]"
        println(avatarColor)

    }
}