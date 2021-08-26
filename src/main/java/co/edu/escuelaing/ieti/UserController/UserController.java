package co.edu.escuelaing.ieti.UserController;

import co.edu.escuelaing.ieti.data.User;
import co.edu.escuelaing.ieti.dto.UserDto;
import co.edu.escuelaing.ieti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController {
    private final UserService userService;

    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }

    @GetMapping //Read
    public ResponseEntity<List<User>> all(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(userService.all());
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById( @PathVariable String id )
    {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody User userDto )
    {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(userService.create(userDto));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }

    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody User userDto, @PathVariable String id )
    {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(userService.update(userDto, id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

        }


    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        try{
            userService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(Boolean.TRUE);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Boolean.FALSE);

        }
    }
}
