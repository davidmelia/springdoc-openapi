package test.org.springdoc.api.app11;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class HelloController {

	@PostMapping(path = "/documents", consumes = "multipart/form-data")
	public ResponseEntity<String> uploadDocuments(@RequestPart("doc") List<MultipartFile> multipartFiles) {
		return null;
	}
	
}
