package py.edu.uca.peoplenewsapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import py.edu.uca.peoplenewsapp.R

/**
 * A simple [Fragment] subclass.
 */
class Inicio : Fragment() {
    companion object{
        fun newInstance(): Inicio = Inicio()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }


}
