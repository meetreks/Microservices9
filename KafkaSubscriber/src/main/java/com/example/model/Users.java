package com.example.model;

public class Users {
	

		private String name;
		private String desc;
		public Users() {
			
		}
		public Users(String name, String desc) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.desc=desc;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
}
