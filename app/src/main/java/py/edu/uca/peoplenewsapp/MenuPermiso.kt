package py.edu.uca.peoplenewsapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_menu_permiso.*

/**
 * A simple [Fragment] subclass.
 */
class MenuPermiso : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_permiso, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnCapacitacion.setOnClickListener { Toast.makeText(context, "Click en tipo de permiso a generar", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.solicitudPermiso)
        }

    }
}
