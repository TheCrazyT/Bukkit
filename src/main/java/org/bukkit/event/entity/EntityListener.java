package org.bukkit.event.entity;

import org.bukkit.event.Listener;

/**
 * Handles all events fired in relation to entities
 */
public class EntityListener implements Listener {
    public EntityListener() {
    }

    public void onEntityDamageByBlock(EntityDamageByBlockEvent event) {
    }

    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
    }
    
    public void onEntityDamageByProjectile(EntityDamageByProjectileEvent event) {
    }
    
    public void onEntityCombust(EntityCombustEvent event) {
    }

    public void onEntityDamage(EntityDamageEvent event) {
    }
}
