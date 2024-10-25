package com.example.a30daysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var tipAdapter: TipAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data for the tips
        val tips = listOf(
            Tip(1, "Choosing a Gardening Space", "Finding a place to plant flowers or a spot in the yard or balcony with good sunlight.", R.drawable.day1),
            Tip(2, "Test Soil", "Check the soil quality to know if you need to add compost or nutrients, or just find black soil.", R.drawable.day2),
            Tip(3, "Pick What to Plant", "Choose plants suitable for the climate, like tomatoes or herbs.", R.drawable.day3),
            Tip(4, "Gather Garden Tools", "Get essential gardening tools like a trowel, watering can, and gloves.", R.drawable.day4),
            Tip(5, "Prepare the Soil", "Loosen the soil and remove any weeds to get it ready for planting.", R.drawable.day5),
            Tip(6, "Start Composting", "Create a small compost pile using kitchen scraps like fruit peels.", R.drawable.day6),
            Tip(7, "Plant Seeds", "Plant a seed or sapling of your chosen vegetable, herb, or flower.", R.drawable.day7),
            Tip(8, "Water Plants Properly", "Water your plants in the morning to avoid evaporation.", R.drawable.day8),
            Tip(9, "Mulch the Soil", "Apply a layer of mulch to retain moisture and prevent weeds.", R.drawable.day9),
            Tip(10, "Prune Dead Leaves", "Trim away any dead leaves or stems to encourage growth.", R.drawable.day10),
            Tip(11, "Fertilize Plants", "Use organic fertilizer or compost to give plants nutrients.", R.drawable.day11),
            Tip(12, "Stake Growing Plants", "Support tall-growing plants like tomatoes with stakes or cages.", R.drawable.day12),
            Tip(13, "Weed Regularly", "Remove weeds that may compete for water and nutrients.", R.drawable.day13),
            Tip(14, "Create a Watering Schedule", "Stick to a regular schedule to ensure consistent watering.", R.drawable.day14),
            Tip(15, "Observe Plant Growth", "Take time to observe how your plants are growing and note any changes.", R.drawable.day15),
            Tip(16, "Protect from Pests", "Check for insects and use natural pest control methods like neem oil.", R.drawable.day16),
            Tip(17, "Aerate the Soil", "Use a fork or aerator to loosen compacted soil for better root growth. Soil aeration is the process of puncturing holes in the ground so air, water and nutrients can get in more easily.", R.drawable.day17),
            Tip(18, "Rotate Your Crops", "Change planting spots each season to avoid depleting soil nutrients.", R.drawable.day18),
            Tip(19, "Propagate Cuttings", "Try growing new plants from cuttings like mint or basil.", R.drawable.day19),
            Tip(20, "Make Own Fertilizer", "Create liquid fertilizer by steeping compost in water.", R.drawable.day20),
            Tip(21, "Build a Raised Bed", "Use wood or stones to create a raised garden bed for better drainage.", R.drawable.day21),
            Tip(22, "Create a Seedling Nursery", "Start seeds indoors or in small containers for transplanting later.", R.drawable.day22),
            Tip(23, "Collect Rainwater", "Install a rain barrel to collect water for your garden.", R.drawable.day23),
            Tip(24, "Learn to Prune", "Prune fruit trees or shrubs to improve airflow and fruit production.", R.drawable.day24),
            Tip(25, "Try Companion Planting", "Plant complementary plants together, like basil with tomatoes.", R.drawable.day25),
            Tip(26, "Transplant Seedlings", "Move your seedlings to larger pots or into the garden.", R.drawable.day26),
            Tip(27, "Encourage Pollinators", "Plant flowers like marigolds to attract bees and butterflies.", R.drawable.day27),
            Tip(28, "Harvest Herbs", "Pick your herbs early in the morning, if already grown, for the best flavor.", R.drawable.day28),
            Tip(29, "Harvest First Veggie", "Pick ripe vegetables like tomatoes or lettuce if it is ready or ripe, for your meals.", R.drawable.day29),
            Tip(30, "Reflect on Your Gardening Journey", "Take note of your successes and challenges, and plan for future improvements.", R.drawable.day30)
        )

        tipAdapter = TipAdapter(tips)
        recyclerView.adapter = tipAdapter
    }
}