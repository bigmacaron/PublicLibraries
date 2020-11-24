package ga.catcat.publiclibraries.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SeoulOpenService {
    @GET("/json/SeoulPublicLibraryInfo/1/200/")
    fun getLibrary(@Path("api_key") key:String):Call<Library>
}