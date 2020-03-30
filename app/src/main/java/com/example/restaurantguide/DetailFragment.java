package com.example.restaurantguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.text.NumberFormat;

public class DetailFragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";
    private Restaurant mRestaurant;
    private TextView mName, mCuisine, mAddress, mRating, mPhone, mPrice;
    private ImageView mImage;

    public DetailFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments().containsKey(ARG_ITEM_ID)) {
            mRestaurant = Restaurant.getRestaurant(getArguments().getString(ARG_ITEM_ID));
            this.getActivity().setTitle(mRestaurant.getName());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        mName = rootView.findViewById(R.id.tvNameField);
        mCuisine = rootView.findViewById(R.id.tvCuisineField);
        mAddress = rootView.findViewById(R.id.tvAddressField);
        mRating = rootView.findViewById(R.id.tvRatingField);
        mPhone = rootView.findViewById(R.id.tvPhoneField);
        mPrice = rootView.findViewById(R.id.tvPriceField);
        mImage = rootView.findViewById(R.id.ivRestaurant);

        if(mRestaurant != null) {
            mName.setText(mRestaurant.getName());
            mCuisine.setText(mRestaurant.getCuisine());
            mAddress.setText(mRestaurant.getAddress());
            mRating.setText(mRestaurant.getRating());
            mPhone.setText(mRestaurant.getPhone());
            mPrice.setText(mRestaurant.getPrice());
            mImage.setImageResource(mRestaurant.getImage());
            mName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        website(mRestaurant.getWebsite());

                }
            });

        }

        return rootView;
    }

    private void website(String name) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(name));
        startActivity(intent);
    }
}