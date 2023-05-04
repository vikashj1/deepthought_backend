package com.vikash.DeepThoughtBackend.Controller;

import com.vikash.DeepThoughtBackend.Exception.ResourceNotFoundException;
import com.vikash.DeepThoughtBackend.Model.Event;
import com.vikash.DeepThoughtBackend.Repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v3/app")
public class DTcontroller {
    @Autowired
    EventRepo eventRepo;


    //API to get an event by ID
    @GetMapping(value = "/events", params = "id")
    public ResponseEntity<Event> getEventID(@RequestParam String id) {
        Event event= eventRepo.findById((id)).orElseThrow(()-> new ResourceNotFoundException("Event does not exist: " + id));
        return ResponseEntity.ok(event);
    }
    //API to get all events
    @GetMapping("/events")
    public List<Event> getAllEvents(){
        return eventRepo.findAll();
    }

    //API to create new events
    @PostMapping("/events")
    public Event createEvent(@RequestBody Event event){
        return eventRepo.save(event);
    }
    //APi to update an event
    @PutMapping("/events/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable String id, @RequestBody Event eventDetails){
        Event event= eventRepo.findById((id)).orElseThrow(()-> new ResourceNotFoundException("Event does not exist: " + id));
        event.setId(eventDetails.getId());
        event.setRigor_rank(eventDetails.getRigor_rank());
        event.setCategory(eventDetails.getCategory());
        event.setModerator(eventDetails.getModerator());
        event.setName(eventDetails.getName());
        event.setDescription(eventDetails.getDescription());
        event.setSub_category(eventDetails.getSub_category());
        event.setSchedule(eventDetails.getSchedule());
        event.setTagline(eventDetails.getTagline());

        Event updatedEvent = eventRepo.save(event);
        return ResponseEntity.ok(updatedEvent);
    }
    //API to delete an event
    @DeleteMapping("/events/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEvent(@PathVariable String id){
        Event event= eventRepo.findById((id)).orElseThrow(()-> new ResourceNotFoundException("Event does not exist: " + id));
        eventRepo.delete(event);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}





