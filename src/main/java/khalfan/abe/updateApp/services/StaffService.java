package khalfan.abe.updateApp.services;

import khalfan.abe.updateApp.model.Staff;
import khalfan.abe.updateApp.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    @Autowired
    public StaffRepository staffRepository;

    public Staff addStaff(Staff staff){
        return staffRepository.save(staff);
    }
    public List<Staff> getStaffs(){
        return staffRepository.findAll();
    }
    public Optional<Staff> getStaff(Integer staffId){
        return staffRepository.findById(staffId);
    }

    public void deleteStaff(Integer staffId){
        staffRepository.deleteById(staffId);
    }
    public Staff updateStaff(Staff staff){
        Staff existing=staffRepository.findById(staff.getStaffId())
                .orElseThrow(()->new IllegalStateException("Staff not exist"));
        existing.setFname(staff.getFname());
        existing.setMname(staff.getMname());
        existing.setLname(staff.getLname());
        existing.setAddress(staff.getAddress());
return staffRepository.save(existing);

    }
}
