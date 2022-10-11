public class Main {
    public static void main(String[] args) {
        // localhost:8080/user/{user_id}
        @GetMapping("/user/{user_id}")
        public User getUserById (@PathVariable int user_id)
        {
            return new User();
        }
        @GetMapping("/user/{user_id}")
                public User findUserById (@RequestParam int user_id){
            return new User();

        }
                    }
}