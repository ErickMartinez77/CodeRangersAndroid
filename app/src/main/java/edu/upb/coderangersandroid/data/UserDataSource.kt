package edu.upb.coderangersandroid.data

import edu.upb.coderangersandroid.model.Post
import edu.upb.coderangersandroid.model.User

object UserDataSource {
    private var user: User? = User("username", "Erick", "Martinez", "https://scontent.flpb3-1.fna.fbcdn.net/v/t1.6435-1/p200x200/116155229_1632281623597699_7569784699382335483_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=7206a8&_nc_ohc=_JNlh8Beqi8AX_dADl4&_nc_ht=scontent.flpb3-1.fna&oh=110bafdfa710ef736086fe007dae3262&oe=6192DF37")

    fun getUser(): User? {
        return user
    }

    fun setUser(user: User?) {
        this.user = user
    }
}