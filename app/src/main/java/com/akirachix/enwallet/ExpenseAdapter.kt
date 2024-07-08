package com.akirachix.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter (val expenseList: List<Expense>): RecyclerView.Adapter<ExpensesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.expense_item_list, parent,false)
        return ExpensesViewHolder((itemView))
    }

    override fun getItemCount(): Int {
        return expenseList.size
    }

    override fun onBindViewHolder(holder: ExpensesViewHolder, position: Int) {
        val expense = expenseList[position]
        holder.tvDate.text= expense.date
        holder.tvAmount.text= expense.amount
        holder.tvTitle.text= expense.title
    }
}

class ExpensesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)

}