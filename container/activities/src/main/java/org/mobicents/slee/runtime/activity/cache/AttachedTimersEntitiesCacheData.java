package org.mobicents.slee.runtime.activity.cache;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.slee.facilities.TimerID;

import org.mobicents.slee.container.activity.ActivityContextHandle;
import org.restcomm.cache.MobicentsCache;
import org.restcomm.cluster.cache.ClusteredCacheData;

public class AttachedTimersEntitiesCacheData extends ClusteredCacheData<ActivityCacheKey,HashMap<TimerID,Void>> 
{
	public AttachedTimersEntitiesCacheData(ActivityContextHandle handle, MobicentsCache cache) {
		super(new ActivityCacheKey(handle, ActivityCacheType.ATTACHED_TIMERS), cache);		
	}
	
	public Boolean attachTime(Boolean createIfNotExists,TimerID timerID) {
		HashMap<TimerID, Void> map=super.getValue();
		if(map==null && createIfNotExists)
			map=new HashMap<TimerID, Void>();
		
		if(map!=null) {
			if(map.containsKey(timerID)) {
				return false;
			}
			else {
				map=new HashMap<TimerID, Void>(map);
				map.put(timerID, null);
				super.putValue(map);
				return true;
			}
		}
		else
			return false;
	}
	
	public Boolean detachTimer(Boolean createIfNotExists,TimerID timerID) {
		HashMap<TimerID, Void> map=super.getValue();
		if(map==null && createIfNotExists) {			
			map=new HashMap<TimerID, Void>();
			super.putValue(map);
			return false;
		}
		
		if(map!=null) {
			if(!map.containsKey(timerID))
				return false;
			else {
				map=new HashMap<TimerID, Void>(map);
				map.remove(timerID);
				super.putValue(map);
				return true;
			}
		}
		else
			return false;
	}
	
	public Boolean hasTimers(Boolean createIfNotExists) {
		HashMap<TimerID, Void> map=super.getValue();
		if(map==null && createIfNotExists) {			
			map=new HashMap<TimerID, Void>();
			super.putValue(map);
			return false;
		}
		
		if(map!=null) {
			return map.size()!=0;
		}
		
		return false;
	}
	
	public Set<TimerID> getTimers(Boolean createIfNotExists) {
		HashMap<TimerID, Void> map=super.getValue();
		if(map==null && createIfNotExists) {			
			map=new HashMap<TimerID, Void>();
			super.putValue(map);
			return map.keySet();
		}
		
		if(map!=null) {
			return map.keySet();
		}
		
		return new HashSet<TimerID>();
	}
	
	public void removeNode() {
		super.remove();
	}
}