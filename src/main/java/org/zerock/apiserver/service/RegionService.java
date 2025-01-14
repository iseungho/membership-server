package org.zerock.apiserver.service;

public interface RegionService {
    void initializeRegion(Long id, String name, Long parentRegionId);
    void addRegion(String name, Long parentRegionId);
}
