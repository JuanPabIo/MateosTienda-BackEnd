package com.codeWithProjects.ecom.services.admin.faq;

import com.codeWithProjects.ecom.dto.FAQDto;

public interface FAQService {

    FAQDto postFAQ(Long productId, FAQDto faqDto);
}
