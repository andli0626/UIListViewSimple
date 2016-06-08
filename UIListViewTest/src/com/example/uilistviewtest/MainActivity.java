package com.example.uilistviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	private List<FruitModel> fruitList = new ArrayList<FruitModel>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initFruits();
		
		FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item, fruitList);
		
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				FruitModel fruit = fruitList.get(position);
				Toast.makeText(MainActivity.this, fruit.getName(),Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void initFruits() {
		
		FruitModel apple 		= new FruitModel("Apple", 		R.drawable.apple_pic);
		fruitList.add(apple);
		
		FruitModel banana 		= new FruitModel("Banana", 		R.drawable.banana_pic);
		fruitList.add(banana);
		
		FruitModel orange 		= new FruitModel("Orange", 	   	R.drawable.orange_pic);
		fruitList.add(orange);
		
		FruitModel watermelon 	= new FruitModel("Watermelon", 	R.drawable.watermelon_pic);
		fruitList.add(watermelon);
		
		FruitModel pear 		= new FruitModel("Pear", 		R.drawable.pear_pic);
		fruitList.add(pear);
		
		FruitModel grape 		= new FruitModel("Grape", 		R.drawable.grape_pic);
		fruitList.add(grape);
		
		FruitModel pineapple 	= new FruitModel("Pineapple", 	R.drawable.pineapple_pic);
		fruitList.add(pineapple);
		
		FruitModel strawberry 	= new FruitModel("Strawberry", 	R.drawable.strawberry_pic);
		fruitList.add(strawberry);
		
		FruitModel cherry 		= new FruitModel("Cherry", 		R.drawable.cherry_pic);
		fruitList.add(cherry);
		
		FruitModel mango 		= new FruitModel("Mango", 		R.drawable.mango_pic);
		fruitList.add(mango);
	}

}