package com.vikash.DeepThoughtBackend.Controller;

import com.vikash.DeepThoughtBackend.Model.Event;
import com.vikash.DeepThoughtBackend.Repository.EventRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/app")
public class DTcontroller {
    private EventRepo eventRepo;



    @GetMapping(value = "/events", params = "id")
    public ResponseEntity<Event> getEventID(@RequestParam(name = "id") String id) {
        Event event = new Event();
        event.setId(id);
        return ResponseEntity.ok(event);
    }
    @GetMapping(value = "/events")
    public ResponseEntity<Event> getEventDetails(
            @RequestParam(name = "type") String type,
            @RequestParam(name = "limit") Integer limit,
            @RequestParam(name = "page") Integer page) {
        Event event = new Event();
        event.setType(type);
        event.setLimit(limit);
        event.setPage(page);
        return ResponseEntity.ok(event);
    }
    @PostMapping("/events")
    public ResponseEntity<Event> createEvent(@RequestBody Event event){
        return new ResponseEntity<>(event, HttpStatus.CREATED);
    }
    @PutMapping("/events/{id}")
    public ResponseEntity<Event> updateEvent(@PathVariable String id, @RequestBody Event updatedEvent){
        updatedEvent.setId(id);
        return ResponseEntity.ok(updatedEvent);
    }
    @DeleteMapping("/events/{id}")
    public ResponseEntity<String> deleteEvent(@PathVariable Long id){
        return ResponseEntity.ok("Deleted successfully");
    }
}





