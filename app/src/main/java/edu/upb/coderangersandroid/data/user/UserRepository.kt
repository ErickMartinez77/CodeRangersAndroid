package edu.upb.coderangersandroid.data.user

import edu.upb.coderangersandroid.data.user.network.UserNetworkController
import edu.upb.coderangersandroid.data.user.network.UserNetworkControllerImp
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepository(val network: UserNetworkController) {
    fun login(username: String, password:String): Flow<Any>{
        return flow{
            network.login(username,password)
            emit(true)
            //new changes
        }
    }
}