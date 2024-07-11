import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dogsbreads.Dog
import com.example.dogsbreads.R
import com.example.dogsbreads.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dogs = listOf(
            Dog(
                R.drawable.affenpinscher_running_outdoors__1_,
                getString(R.string.affenpinscher),
                getString(R.string.affenpincher_desc)
            ),
            Dog(
                R.drawable.afghan_hound_standing_in_a_garden,
                getString(R.string.afghan_Hound),
                getString(R.string.afghan_Hound_des)
            ),
            Dog(
                R.drawable.airedale_terrier_standing_stacked_outdoors,
                getString(R.string.airedale_Terrier),
                getString(R.string.airedale_Terrie_desc)
            ),
            Dog(
                R.drawable.akita_standing_outdoors_in_the_summer,
                getString(R.string.Akita),
                getString(R.string.akita_desc)
            ),
            Dog(
                R.drawable.alaskan_malamute_standing_in_the_grass1,
                getString(R.string.Alaskan_Malamute),
                getString(R.string.Alaskan_Malamute_desc)
            ),
            Dog(
                R.drawable.alaskan_klee_kai_standing_in_the_snow_attached_to_a_harness1,
                getString(R.string.Alaskan_Klee_Kai),
                getString(R.string.Alaskan_Klee_Kai_desc)
            ),
            Dog(
                R.drawable.american_bulldog_standing_in_three_quarter_view,
                getString(R.string.American_Bulldog),
                getString(R.string.American_Bulldog_desc)
            )
        )

        binding.rvMain.layoutManager = LinearLayoutManager(this)
        binding.rvMain.adapter = DogAdapter(dogs)
    }
}
