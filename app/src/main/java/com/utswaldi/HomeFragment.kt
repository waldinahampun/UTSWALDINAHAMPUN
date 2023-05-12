package com.utswaldi

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SuperheroAdapeter
    private lateinit var dataList: ArrayList<Data>

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Inisialisasi ArrayList
        dataList = ArrayList()

        // Menambahkan data ke dalam ArrayList
        dataList.add(Data("Yulian", R.drawable.lisa, "Wanita Berkarir Dan Banyak Disukai"))
        dataList.add(Data("Elina", R.drawable.aku,"Wanita Berkarir Dan Banyak Disukai"))
        dataList.add(Data("Risa", R.drawable.apa,"Wanita Berkarir Dan Banyak Disukai"))
        dataList.add(Data("Tia", R.drawable.bagaimana, "Wanita Berkarir Dan Banyak Disukai"))
        dataList.add(Data("Rania", R.drawable.dia,"Wanita Berkarir Dan Banyak Disukait"))
        dataList.add(Data("Tiara", R.drawable.dimana,"Wanita Berkarir Dan Banyak Disukait"))
        dataList.add(Data("Himai", R.drawable.kemana,"Wanita Berkarir Dan Banyak Disukait"))
        dataList.add(Data("Cantika", R.drawable.lelah,"Wanita Berkarir Dan Banyak Disukait"))
        dataList.add(Data("Jisai", R.drawable.mengapa,"Wanita Berkarir Dan Banyak Disukait"))
        dataList.add(Data("Ririn", R.drawable.siapa,"Wanita Berkarir Dan Banyak Disukait"))

        // Menambahkan adapter ke RecyclerView
        adapter = SuperheroAdapeter(dataList)
        recyclerView.adapter = adapter

        return view
    }
    companion object{
        val INTENT_PARCELABLE = "OBJECK INTENT"
    }


}