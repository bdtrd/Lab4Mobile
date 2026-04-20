package com.meowmurmur.lab4mobile

object CityRepository {
    private val categories = listOf(
        CityCategory(
            id = "castle",
            nameRes = R.string.category_castle_name,
            subtitleRes = R.string.category_castle_subtitle,
            recommendationsTitleRes = R.string.category_castle_recommendations_title,
            illustrationRes = R.drawable.town_castle,
            recommendations = listOf(
                Recommendation(
                    id = "castle_colossus",
                    titleRes = R.string.rec_castle_colossus,
                    summaryRes = R.string.rec_castle_colossus_summary,
                    descriptionRes = R.string.rec_castle_colossus_description,
                    illustrationRes = R.drawable.castle_colossus
                ),
                Recommendation(
                    id = "castle_griffin_tower",
                    titleRes = R.string.rec_castle_griffin_tower,
                    summaryRes = R.string.rec_castle_griffin_tower_summary,
                    descriptionRes = R.string.rec_castle_griffin_tower_description,
                    illustrationRes = R.drawable.castle_griffintower
                ),
                Recommendation(
                    id = "castle_lighthouse",
                    titleRes = R.string.rec_castle_lighthouse,
                    summaryRes = R.string.rec_castle_lighthouse_summary,
                    descriptionRes = R.string.rec_castle_lighthouse_description,
                    illustrationRes = R.drawable.castle_lighthouse
                ),
                Recommendation(
                    id = "castle_portal_of_glory",
                    titleRes = R.string.rec_castle_portal_of_glory,
                    summaryRes = R.string.rec_castle_portal_of_glory_summary,
                    descriptionRes = R.string.rec_castle_portal_of_glory_description,
                    illustrationRes = R.drawable.castle_portalofglory
                ),
                Recommendation(
                    id = "castle_training_grounds",
                    titleRes = R.string.rec_castle_training_grounds,
                    summaryRes = R.string.rec_castle_training_grounds_summary,
                    descriptionRes = R.string.rec_castle_training_grounds_description,
                    illustrationRes = R.drawable.castle_traininggrounds
                )
            )
        ),
        CityCategory(
            id = "rampart",
            nameRes = R.string.category_rampart_name,
            subtitleRes = R.string.category_rampart_subtitle,
            recommendationsTitleRes = R.string.category_rampart_recommendations_title,
            illustrationRes = R.drawable.town_rampart,
            recommendations = listOf(
                Recommendation(
                    id = "rampart_dragon_cliffs",
                    titleRes = R.string.rec_rampart_dragon_cliffs,
                    summaryRes = R.string.rec_rampart_dragon_cliffs_summary,
                    descriptionRes = R.string.rec_rampart_dragon_cliffs_description,
                    illustrationRes = R.drawable.rampart_dragoncliffs
                ),
                Recommendation(
                    id = "rampart_enchanted_spring",
                    titleRes = R.string.rec_rampart_enchanted_spring,
                    summaryRes = R.string.rec_rampart_enchanted_spring_summary,
                    descriptionRes = R.string.rec_rampart_enchanted_spring_description,
                    illustrationRes = R.drawable.rampart_enchantedspring
                ),
                Recommendation(
                    id = "rampart_mystic_pond",
                    titleRes = R.string.rec_rampart_mystic_pond,
                    summaryRes = R.string.rec_rampart_mystic_pond_summary,
                    descriptionRes = R.string.rec_rampart_mystic_pond_description,
                    illustrationRes = R.drawable.rampart_mysticpond
                ),
                Recommendation(
                    id = "rampart_unicorn_glade",
                    titleRes = R.string.rec_rampart_unicorn_glade,
                    summaryRes = R.string.rec_rampart_unicorn_glade_summary,
                    descriptionRes = R.string.rec_rampart_unicorn_glade_description,
                    illustrationRes = R.drawable.rampart_unicornglade
                )
            )
        ),
        CityCategory(
            id = "tower",
            nameRes = R.string.category_tower_name,
            subtitleRes = R.string.category_tower_subtitle,
            recommendationsTitleRes = R.string.category_tower_recommendations_title,
            illustrationRes = R.drawable.town_tower,
            recommendations = listOf(
                Recommendation(
                    id = "tower_library",
                    titleRes = R.string.rec_tower_library,
                    summaryRes = R.string.rec_tower_library_summary,
                    descriptionRes = R.string.rec_tower_library_description,
                    illustrationRes = R.drawable.tower_library
                ),
                Recommendation(
                    id = "tower_lookout_tower",
                    titleRes = R.string.rec_tower_lookout_tower,
                    summaryRes = R.string.rec_tower_lookout_tower_summary,
                    descriptionRes = R.string.rec_tower_lookout_tower_description,
                    illustrationRes = R.drawable.tower_lookouttower
                ),
                Recommendation(
                    id = "tower_mage_tower",
                    titleRes = R.string.rec_tower_mage_tower,
                    summaryRes = R.string.rec_tower_mage_tower_summary,
                    descriptionRes = R.string.rec_tower_mage_tower_description,
                    illustrationRes = R.drawable.tower_magetower
                ),
                Recommendation(
                    id = "tower_skyship",
                    titleRes = R.string.rec_tower_skyship,
                    summaryRes = R.string.rec_tower_skyship_summary,
                    descriptionRes = R.string.rec_tower_skyship_description,
                    illustrationRes = R.drawable.tower_skyship
                )
            )
        ),
        CityCategory(
            id = "inferno",
            nameRes = R.string.category_inferno_name,
            subtitleRes = R.string.category_inferno_subtitle,
            recommendationsTitleRes = R.string.category_inferno_recommendations_title,
            illustrationRes = R.drawable.town_inferno,
            recommendations = listOf(
                Recommendation(
                    id = "inferno_brimstone_storm_clouds",
                    titleRes = R.string.rec_inferno_brimstone_storm_clouds,
                    summaryRes = R.string.rec_inferno_brimstone_storm_clouds_summary,
                    descriptionRes = R.string.rec_inferno_brimstone_storm_clouds_description,
                    illustrationRes = R.drawable.inferno_brimstonestormclouds
                ),
                Recommendation(
                    id = "inferno_fire_lake",
                    titleRes = R.string.rec_inferno_fire_lake,
                    summaryRes = R.string.rec_inferno_fire_lake_summary,
                    descriptionRes = R.string.rec_inferno_fire_lake_description,
                    illustrationRes = R.drawable.inferno_firelake
                ),
                Recommendation(
                    id = "inferno_forsaken_palace",
                    titleRes = R.string.rec_inferno_forsaken_palace,
                    summaryRes = R.string.rec_inferno_forsaken_palace_summary,
                    descriptionRes = R.string.rec_inferno_forsaken_palace_description,
                    illustrationRes = R.drawable.inferno_forsakenpalace
                ),
                Recommendation(
                    id = "inferno_kennels",
                    titleRes = R.string.rec_inferno_kennels,
                    summaryRes = R.string.rec_inferno_kennels_summary,
                    descriptionRes = R.string.rec_inferno_kennels_description,
                    illustrationRes = R.drawable.inferno_kennels
                )
            )
        ),
        CityCategory(
            id = "necropolis",
            nameRes = R.string.category_necropolis_name,
            subtitleRes = R.string.category_necropolis_subtitle,
            recommendationsTitleRes = R.string.category_necropolis_recommendations_title,
            illustrationRes = R.drawable.town_necropolis,
            recommendations = listOf(
                Recommendation(
                    id = "necropolis_estate",
                    titleRes = R.string.rec_necropolis_estate,
                    summaryRes = R.string.rec_necropolis_estate_summary,
                    descriptionRes = R.string.rec_necropolis_estate_description,
                    illustrationRes = R.drawable.necropolis_estate
                ),
                Recommendation(
                    id = "necropolis_mausoleum",
                    titleRes = R.string.rec_necropolis_mausoleum,
                    summaryRes = R.string.rec_necropolis_mausoleum_summary,
                    descriptionRes = R.string.rec_necropolis_mausoleum_description,
                    illustrationRes = R.drawable.necropolis_mauseleum
                ),
                Recommendation(
                    id = "necropolis_skeleton_transformer",
                    titleRes = R.string.rec_necropolis_skeleton_transformer,
                    summaryRes = R.string.rec_necropolis_skeleton_transformer_summary,
                    descriptionRes = R.string.rec_necropolis_skeleton_transformer_description,
                    illustrationRes = R.drawable.necropolis_skeletontransformer
                )
            )
        ),
        CityCategory(
            id = "dungeon",
            nameRes = R.string.category_dungeon_name,
            subtitleRes = R.string.category_dungeon_subtitle,
            recommendationsTitleRes = R.string.category_dungeon_recommendations_title,
            illustrationRes = R.drawable.town_dungeon,
            recommendations = listOf(
                Recommendation(
                    id = "dungeon_chapel_of_stilled_voices",
                    titleRes = R.string.rec_dungeon_chapel_of_stilled_voices,
                    summaryRes = R.string.rec_dungeon_chapel_of_stilled_voices_summary,
                    descriptionRes = R.string.rec_dungeon_chapel_of_stilled_voices_description,
                    illustrationRes = R.drawable.dungeon_chapelofstilledvoices
                ),
                Recommendation(
                    id = "dungeon_dragon_cave",
                    titleRes = R.string.rec_dungeon_dragon_cave,
                    summaryRes = R.string.rec_dungeon_dragon_cave_summary,
                    descriptionRes = R.string.rec_dungeon_dragon_cave_description,
                    illustrationRes = R.drawable.dungeon_dragoncave
                ),
                Recommendation(
                    id = "dungeon_labyrinth",
                    titleRes = R.string.rec_dungeon_labyrinth,
                    summaryRes = R.string.rec_dungeon_labyrinth_summary,
                    descriptionRes = R.string.rec_dungeon_labyrinth_description,
                    illustrationRes = R.drawable.dungeon_labyrinth
                ),
                Recommendation(
                    id = "dungeon_mana_vortex",
                    titleRes = R.string.rec_dungeon_mana_vortex,
                    summaryRes = R.string.rec_dungeon_mana_vortex_summary,
                    descriptionRes = R.string.rec_dungeon_mana_vortex_description,
                    illustrationRes = R.drawable.dungeon_manavortex
                ),
                Recommendation(
                    id = "dungeon_mushroom_rings",
                    titleRes = R.string.rec_dungeon_mushroom_rings,
                    summaryRes = R.string.rec_dungeon_mushroom_rings_summary,
                    descriptionRes = R.string.rec_dungeon_mushroom_rings_description,
                    illustrationRes = R.drawable.dungeon_mushroomrings
                )
            )
        ),
        CityCategory(
            id = "stronghold",
            nameRes = R.string.category_stronghold_name,
            subtitleRes = R.string.category_stronghold_subtitle,
            recommendationsTitleRes = R.string.category_stronghold_recommendations_title,
            illustrationRes = R.drawable.town_stronghold,
            recommendations = listOf(
                Recommendation(
                    id = "stronghold_behemoth_lair",
                    titleRes = R.string.rec_stronghold_behemoth_lair,
                    summaryRes = R.string.rec_stronghold_behemoth_lair_summary,
                    descriptionRes = R.string.rec_stronghold_behemoth_lair_description,
                    illustrationRes = R.drawable.stronghold_behemothlair
                ),
                Recommendation(
                    id = "stronghold_hall_of_valhalla",
                    titleRes = R.string.rec_stronghold_hall_of_valhalla,
                    summaryRes = R.string.rec_stronghold_hall_of_valhalla_summary,
                    descriptionRes = R.string.rec_stronghold_hall_of_valhalla_description,
                    illustrationRes = R.drawable.stronghold_hallofvalhalla
                ),
                Recommendation(
                    id = "stronghold_mess_hall",
                    titleRes = R.string.rec_stronghold_mess_hall,
                    summaryRes = R.string.rec_stronghold_mess_hall_summary,
                    descriptionRes = R.string.rec_stronghold_mess_hall_description,
                    illustrationRes = R.drawable.stronghold_messhall
                ),
                Recommendation(
                    id = "stronghold_warlords_monument",
                    titleRes = R.string.rec_stronghold_warlords_monument,
                    summaryRes = R.string.rec_stronghold_warlords_monument_summary,
                    descriptionRes = R.string.rec_stronghold_warlords_monument_description,
                    illustrationRes = R.drawable.stronghold_warlordsmonument
                )
            )
        ),
        CityCategory(
            id = "fortress",
            nameRes = R.string.category_fortress_name,
            subtitleRes = R.string.category_fortress_subtitle,
            recommendationsTitleRes = R.string.category_fortress_recommendations_title,
            illustrationRes = R.drawable.town_fortress,
            recommendations = listOf(
                Recommendation(
                    id = "fortress_basilisk_pit",
                    titleRes = R.string.rec_fortress_basilisk_pit,
                    summaryRes = R.string.rec_fortress_basilisk_pit_summary,
                    descriptionRes = R.string.rec_fortress_basilisk_pit_description,
                    illustrationRes = R.drawable.fortress_basiliskpit
                ),
                Recommendation(
                    id = "fortress_carnivorous_plant",
                    titleRes = R.string.rec_fortress_carnivorous_plant,
                    summaryRes = R.string.rec_fortress_carnivorous_plant_summary,
                    descriptionRes = R.string.rec_fortress_carnivorous_plant_description,
                    illustrationRes = R.drawable.fortress_carnivorousplant
                ),
                Recommendation(
                    id = "fortress_gnoll_hut",
                    titleRes = R.string.rec_fortress_gnoll_hut,
                    summaryRes = R.string.rec_fortress_gnoll_hut_summary,
                    descriptionRes = R.string.rec_fortress_gnoll_hut_description,
                    illustrationRes = R.drawable.fortress_gnollhut
                ),
                Recommendation(
                    id = "fortress_gorgon_lair",
                    titleRes = R.string.rec_fortress_gorgon_lair,
                    summaryRes = R.string.rec_fortress_gorgon_lair_summary,
                    descriptionRes = R.string.rec_fortress_gorgon_lair_description,
                    illustrationRes = R.drawable.fortress_gorgonlair
                ),
                Recommendation(
                    id = "fortress_hydra_pond",
                    titleRes = R.string.rec_fortress_hydra_pond,
                    summaryRes = R.string.rec_fortress_hydra_pond_summary,
                    descriptionRes = R.string.rec_fortress_hydra_pond_description,
                    illustrationRes = R.drawable.fortress_hydrapond
                )
            )
        )
    )

    fun getCategories(): List<CityCategory> = categories

    fun getCategory(categoryId: String): CityCategory? =
        categories.firstOrNull { it.id == categoryId }

    fun getRecommendation(categoryId: String, recommendationId: String): Recommendation? =
        getCategory(categoryId)?.recommendations?.firstOrNull { it.id == recommendationId }
}
