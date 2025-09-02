import { TestBed } from '@angular/core/testing';
import { App } from './app';

describe('App', () => {
  let component: App;

  beforeEach(() => {
    component = new App();
  });

  it('should return true for a valid palindrome', () => {
    expect(component.isPalindrome('Madam')).toBeTrue();
  });

  it('should return false for a non-palindrome', () => {
    expect(component.isPalindrome('Angular')).toBeFalse();
  });

  it('should handle empty string as false', () => {
    expect(component.isPalindrome('')).toBeFalse();
  });

  it('should ignore punctuation and case', () => {
    expect(component.isPalindrome('A man, a plan, a canal: Panama')).toBeTrue();
  });
});

