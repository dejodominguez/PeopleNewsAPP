package py.edu.uca.peoplenewsapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_ausencias.*
import kotlinx.android.synthetic.main.fragment_menu_princi.*
import javax.security.auth.login.LoginException

/**
 * A simple [Fragment] subclass.
 */
class MenuPrinci : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_princi, container, false)

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnSPermiso.setOnClickListener { Toast.makeText(context, "Click en tipo de permiso a generar", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.menuPermiso)
        }
        btnSReposo.setOnClickListener { Toast.makeText(context, "Click en tipo de reposo a generar", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.menuReposo)
        }
        btnJAusencia.setOnClickListener { Toast.makeText(context, "Cargar ausencia", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.ausencias)
        }
        btnSVacacion.setOnClickListener { Toast.makeText(context, "Cargar solicitud de vaciones", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.vacaciones)
        }
        btnMSolicitud.setOnClickListener { Toast.makeText(context, "Cargar solicitud de vaciones", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.miSolicitud)
        }
        btnDPersonal.setOnClickListener { Toast.makeText(context, "Cargar solicitud de vaciones", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.datosPersonales)
        }
    }



}
