package com.example.lesson6_month3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lesson6_month3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.item_animal.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: AnimalAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        initial()


    }



    private fun initial() {
        recyclerView = binding.rvAnimal
        adapter = AnimalAdapter()
        recyclerView.adapter = adapter
        adapter.setList(animal())


    }

    private fun animal(): ArrayList<Animal>{
        val animalList = ArrayList<Animal>()

        animalList.add(Animal("Лев", "Хищные млекопитающие",
           "https://www.pngall.com/wp-content/uploads/2016/03/Lion-Free-Download-PNG.png"))
        animalList.add(Animal("Алигатор", "Пресмыкающиеся",
            "https://www.pngmart.com/files/5/Alligator-PNG-Pic.png"))
        animalList.add(Animal("Сокол", "Хищные птицы",
            "https://www.pngall.com/wp-content/uploads/2016/05/Falcon.png"))
        animalList.add(Animal("Дельфин", "Водные млекопитающие",
            "https://www.pngplay.com/wp-content/uploads/6/Blue-Dolphin-PNG.png"))
        animalList.add(Animal("Акула", "Хрящевые рыбы",
            "https://www.pngplay.com/wp-content/uploads/9/Shark-PNG-Images-HD.png"))
        animalList.add(Animal("Панда", "Всеядные млекопитающие",
            "https://pngimg.com/uploads/panda/panda_PNG8.png"))
        animalList.add(Animal("Хамелион", "Пресмыкающиеся",
            "https://www.pngall.com/wp-content/uploads/5/Real-Chameleon-PNG-Free-Download.png"))
        animalList.add(Animal("Пантера", "Хищные млекопитающие",
            "https://avatanplus.com/files/resources/original/5e023547c910916f38a02090.png"))
        animalList.add(Animal("Олень", "Травоядные млекопитающие",
            "https://www.pngmart.com/files/9/Reindeer-PNG-Pic.png"))
        animalList.add(Animal("Питон", "Пресмыкающиеся",
            "https://thumbs.dreamstime.com/b/ball-python-7283488.jpg"))

        return animalList
    }

}