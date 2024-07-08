package com.akirachix.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvExpense.layoutManager= LinearLayoutManager(this)
        displayExpense()

    }


    fun displayExpense(){
        var expense1 = Expense("","KES 20000","SALARY","2 JUNE 2024")
        var expense2 = Expense("http://schemas.android.com/apk/res/android","KES 20000","RENT","2 FEBRUARY 2024")
        var expense3 = Expense("","KES 20000","SALARY","2 JANUARY 2024")


        val expenseList = listOf(expense1,expense2,expense3)
        val expenseAdapter = ExpenseAdapter(expenseList)
        binding.rvExpense.adapter = expenseAdapter
    }
}