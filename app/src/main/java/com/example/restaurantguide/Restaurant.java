package com.example.restaurantguide;

import java.util.ArrayList;

public class Restaurant {
    private String name, cuisine, location, address, rating, phone, price, website;
    private int image;

    public Restaurant(){
    }

    public Restaurant(String name, String cuisine, String location, String address, String rating, String phone, String price, int image, String website){
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.address = address;
        this.rating = rating;
        this.phone = phone;
        this.price = price;
        this.image = image;
        this.website = website;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCuisine(){
        return cuisine;
    }

    public void setCuisine(String cuisine){
        this.cuisine = cuisine;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getAddress() { return address; }

    public void setAddress(String address) {this.address = address; }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public int getImage(){ return image; }

    public void setImage(int image) { this.image = image; }

    public String getWebsite() { return website; }

    public void setWebsite(String website) { this.website = website; }

    public static Restaurant getRestaurant(String id) {
        for(Restaurant restaurant : getRestaurants()) {
            if(restaurant.getRating().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }

    public static ArrayList<Restaurant> getRestaurants(){
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Momofuku Seiobo", "Asian-European Fusion", "Pyrmont, NSW 2009", "Level G/80 Pyrmont St, Pyrmont NSW 2009", "9.0/10", "(02) 9657 9169", "$$$$", R.drawable.momofuku1, "https://seiobo.momofuku.com/"));
        restaurants.add(new Restaurant("Tetsuya's Restaurant", "Japanese", "Sydney, NSW 2000", "529 Kent St, Sydney NSW 2000", "9.2/10", "(02) 9267 2900", "$$$$", R.drawable.tetsuya1, "https://tetsuyas.com/"));
        restaurants.add(new Restaurant("Quay", "Contemporary Australian", "The Rocks, NSW 2000", "Upper Overseas Passenger Terminal, The Rocks NSW 2000", "8.8/10", "(02) 9251 5600", "$$$$", R.drawable.quay1, "https://www.quay.com.au/"));
        restaurants.add(new Restaurant("Munich Brauhaus", "German", "The Rocks, NSW 2000", "33 Playfair St &, Argyle St, The Rocks NSW 2000", "8.2/10", "1300 686 424", "$$$", R.drawable.munich1, "https://www.thebavarians.com/munich/"));
        restaurants.add(new Restaurant("Golden Century", "Chinese", "Sydney, NSW 2000", "393-399 Sussex St, Sydney NSW 2000", "8.0/10", "(02) 9212 3901", "$$$", R.drawable.golden1, "http://www.goldencentury.com.au/"));
        restaurants.add(new Restaurant("Chat Thai", "Thai", "Haymarket, NSW 2000", "20 Campbell St, Haymarket NSW 2000", "8.4/10", "(02) 9211 1808", "$$", R.drawable.chat1, "http://www.chatthai.com.au/"));
        restaurants.add(new Restaurant("Sáng by Mabasa", "Korean", "Surry Hills, NSW 2010", "98 Fitzroy St, Surry Hills NSW 2010", "9.4/10", "(02) 9331 5175", "$", R.drawable.sang1, "https://www.sangbymabasa.com.au/"));
        restaurants.add(new Restaurant("Harvest Buffet", "Combination", "Pyrmont, NSW 2009", "80 Pyrmont St, Pyrmont NSW 2009", "8.2/10", "(02) 9777 9000", "$$", R.drawable.harvest1, "https://www.star.com.au/sydney/eat-and-drink/casual-dining/harvest-buffet"));
        restaurants.add(new Restaurant("Restaurant Hubert", "French", "Sydney, NSW 2000", "15 Bligh St, Sydney NSW 2000", "9.2/10", "(02) 9232 0881", "$$$", R.drawable.hubert1, "https://www.restauranthubert.com/"));
        restaurants.add(new Restaurant("Aria", "Contemporary Australian", "Sydney, NSW 2000", "1 Macquarie St, Sydney NSW 2000", "9.0/10", "(02) 9240 2255", "$$$$", R.drawable.aria1, "https://www.ariasydney.com.au/"));
        return restaurants;
    }

}
