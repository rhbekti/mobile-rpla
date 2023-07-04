package com.rhbekti.daftarpeserta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyCustomAdapter(val items:List<Person>,val clickListener: (Person) -> Unit) : RecyclerView.Adapter<MyCustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            MyCustomAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: MyCustomAdapter.ViewHolder, position: Int)
    {
        holder.bind(items[position], clickListener)
    }
    class ViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(person: Person,clickListener: (Person) -> Unit) {
            7
            val txtNama = itemView.findViewById<TextView>(R.id.tv_list_item) as TextView
            txtNama.text = person.name
            itemView.setOnClickListener{clickListener(person)}
        }
    }
}