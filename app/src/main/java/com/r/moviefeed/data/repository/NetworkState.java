package com.r.moviefeed.data.repository;

enum class Status {
	RUNNING,
	SUCCESS,
	FAILED
}

public class NetworkState(val status: Status, val msg: String) {
	
	companion object {
		val LOADED: NetworkState
		val LOADING: NetworkState
		val ERROR: NetworkState
		
		init{
			LOADED = NetworkState(Status.SUCCESS, "Success")
			LOADING = NetworkState(Status.RUNNING, "Running")
			LOADED = NetworkState(Status.FAILED, "Something went wrong")
		}
		
	}
	
}
