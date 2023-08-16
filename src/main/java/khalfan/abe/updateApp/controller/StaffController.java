package khalfan.abe.updateApp.controller;

import khalfan.abe.updateApp.model.Staff;
import khalfan.abe.updateApp.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/staff")
@CrossOrigin("*")
public class StaffController {
    @Autowired
    public StaffService staffService;

    @PostMapping
    public Staff addStaff(@RequestBody Staff staff){
        return staffService.addStaff(staff);
    }
    @GetMapping
    public List<Staff> getStaffs(){
        return staffService.getStaffs();
    }
    @GetMapping("/{staffid}")
    public Optional<Staff> getStaff(@PathVariable Integer staffid){
        return staffService.getStaff(staffid);
    }
    @DeleteMapping("/{staffId}")
    public void deleteStaff(@PathVariable Integer staffId){
        staffService.deleteStaff(staffId);
    }

@PutMapping("/{staffId}")
    public Staff updateSatff(@RequestBody Staff staff,@PathVariable Integer staffId){
        staff.setStaffId(staffId);
        return staffService.updateStaff(staff);
    }
    }
