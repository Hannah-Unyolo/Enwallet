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
        var expense2 = Expense("","KES 20000","RENT","2 FEBRUARY 2024")
        var expense3 = Expense("","KES 20000","SALARY","2 JANUARY 2024")
        var expense4 = Expense("","KES 20000","SALARY","2 JUNE 2024")
        var expense5 = Expense("","KES 20000","RENT","2 FEBRUARY 2024")
        var expense6 = Expense("","KES 20000","SALARY","2 JANUARY 2024")
        var expense7 = Expense("","KES 20000","SALARY","2 JUNE 2024")
        var expense8= Expense("","KES 20000","RENT","2 FEBRUARY 2024")
        var expense9 = Expense("","KES 20000","SALARY","2 JANUARY 2024")
        var expense10 = Expense("","KES 20000","SALARY","2 JUNE 2024")
        var expense11 = Expense("","KES 20000","RENT","2 FEBRUARY 2024")
        var expense12 = Expense("","KES 20000","SALARY","2 JANUARY 2024")


        val expenseList = listOf(expense1,expense2,expense3,expense4,expense5,expense6,expense7,expense8,expense9,expense10,expense11,expense12)
        val expenseAdapter = ExpenseAdapter(expenseList)
        binding.rvExpense.adapter = expenseAdapter
    }
}