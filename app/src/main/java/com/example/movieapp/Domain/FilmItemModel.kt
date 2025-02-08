import com.example.movieapp.Domain.CastModel
import java.io.Serializable

data class FilmItemModel(
    val Title: String="",
    val Description: String="",
    val Poster: String="",
    val Time: String="",
    val Trailer: String="",
    val Imdb: Int=0,
    val Year: Int=0,
    val price: Double = 0.0,
    val Genre: ArrayList<String> = ArrayList(),
    val Casts: ArrayList<CastModel> = ArrayList()
) : Serializable
