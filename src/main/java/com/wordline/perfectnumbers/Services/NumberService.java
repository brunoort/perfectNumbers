package com.wordline.perfectnumbers.Services;

import java.util.List;

public interface NumberService {

	Boolean check(Long id);

	List<Long> checkRange(Long startNumber, Long endNumber);
}
