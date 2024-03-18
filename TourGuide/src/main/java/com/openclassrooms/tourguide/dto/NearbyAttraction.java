package com.openclassrooms.tourguide.dto;

public record NearbyAttraction(
        String touristAttractionName,
        Double attractionLongitudeLocation,
        Double attractionLatitudeLocation,
        Double userLongitudeLocation,
        Double userLatitudeLocation,
        Double distanceBetweenUserAndAttractionInMiles,
        Integer rewardPointsForVisitingAttraction
) {
}
